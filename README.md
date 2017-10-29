
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

 
