```shell
$ jlink --module-path mods/production:"$JAVA_HOME"/jmods --add-modules com.yumi.hello --output HelloWorldJRE
$ cd HelloWorldJRE\bin
$ ./java -m com.yumi.hello/com.yumi.hello.HelloWorldApp
```



javac -d out --module-source-path "./*/src" $(find . -name "*.java")
使用这个命令能够同时编译多个模块，也就是说
--module-source-path中的是依赖和要编译的所有的模块源码
--module-path中是依赖的已经编译好的模块class

javac -p mods/production  -d mm $(find com.yumi.hello/src -name "*.java")

java -p mods/production -m com.yumi.hello/com.yumi.hello.HelloWorldApp
运行编译好的内容


$ jar --create --file mlib/com.yumi.hello@0.1.jar
--module-version 0.1
--main-class com.yumi.hello.HelloWorldApp
-C mods/com.yumi.hello .
java --module-path mlib -m com.yumi.hello

打jar包以及运行起来