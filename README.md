
##安装

 
在 glide中导入
repositories {
    mavenCentral()
    maven { url 'https://maven.google.com' }
}


dependencies {
    compile 'com.github.bumptech.glide:glide:4.2.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.2.0'
}

glide包
  compile 'com.github.bumptech.glide:glide:4.2.0'
 
导入注解后可使用Generated API
  annotationProcessor 'com.github.bumptech.glide:compiler:4.2.0'
  
  
当时使用android studio 2.1.0编译一直Gradle DSL methode not found annotationProcessor()
 
经查资料发现 在android studio 2.1.0 对应的gradle 2.1 并没有 annotationProcessor方法
 
解决方法升级android studio 


##基本用法

Glide.with(fragment).load(url).into(view);


GlideApp用法需要annotationProcessor 'com.github.bumptech.glide:compiler:4.2.0'
之后再重写一个MyGlideApp类继承AppGlideModule,并增加注解，最后重新编译
@GlideModule
public class MyAppGlideModule extends AppGlideModule{
}

##占位符
placeholder 占位符是当请求正在执行时被展示的 Drawable 。
error 请求出错时使用的drawable
fallball  fallback Drawable 在请求的url/model为 null 时展示。
GlideApp.with(fragment).load(url).placeholder(drawable).into(view);


 

 


 
 
