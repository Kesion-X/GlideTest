
## `安装`

 
在 glide中导入
`repositories {
    mavenCentral()
    maven { url 'https://maven.google.com' }
}
`


`dependencies {
    compile 'com.github.bumptech.glide:glide:4.2.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.2.0'
}
`
glide包
  `compile 'com.github.bumptech.glide:glide:4.2.0'`
 
导入注解后可使用Generated API
  `annotationProcessor 'com.github.bumptech.glide:compiler:4.2.0'`
  
  
当时使用android studio 2.1.0编译一直Gradle DSL methode not found annotationProcessor()
 
经查资料发现 在android studio 2.1.0 对应的gradle 2.1 并没有 annotationProcessor方法
 
解决方法升级android studio 


## `基本用法`

Glide.with(fragment).load(url).into(view);


GlideApp用法需要annotationProcessor 'com.github.bumptech.glide:compiler:4.2.0'
之后再重写一个MyGlideApp类继承AppGlideModule,并增加注解，最后重新编译

`@GlideModule
public class MyAppGlideModule extends AppGlideModule{
}`

## `占位符`
placeholder 占位符是当请求正在执行时被展示的 Drawable 。
error 请求出错时使用的drawable
fallball  fallback Drawable 在请求的url/model为 null 时展示。
GlideApp.with(fragment).load(url).placeholder(drawable).into(view);


## `缓存策略`
增加内存缓存
增加磁盘缓存
在AppGlideModule
`@GlideModule
public class MyAppGlideModule extends AppGlideModule{


    /**
     * 设置内存缓存及磁盘缓存
     * @param context
     * @param builder
     */
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {

        //TODO （1） 设置内存缓存
        MemorySizeCalculator mMemorySizeCalculator = new MemorySizeCalculator.Builder(context)
                .setMemoryCacheScreens(2)
                .build();
        builder.setMemoryCache(new LruResourceCache(mMemorySizeCalculator.getMemoryCacheSize()));


        //TODO (2) 设置外存缓存
        builder.setDiskCache(new ExternalCacheDiskCacheFactory(context));



    }




}
`

使用规则：
`{/**
 * 缓存策略的使用
 * diskcacheStrategy(DiskCacheStratrgy.ALL) 可根据网络请求判断做出是否要从磁盘读取
 * onlyRetrieveFromCache(true)  某些情形下，你可能希望只要图片不在缓存中则加载直接失败。如果要完成这个 目   标，你可以在单个请求的基础上使用 onlyRetrieveFromCache 方法：
 */
GlideApp.with(this)
.load("")
.placeholder(R.drawable.timg)
.error(R.drawable.error)
.diskCacheStrategy(DiskCacheStrategy.ALL)
.onlyRetrieveFromCache(true)
.into(ImageView3);}`







 

 


 
 
