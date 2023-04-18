```shell
$ jlink --module-path mods:"$JAVA_HOME"/jmods --add-modules eg.com.taman.hello --output HelloWorldJRE
$ cd HelloWorldJRE\bin
$ ./java -m eg.com.taman.hello/eg.com.taman.hello.HelloWorldApp
```



javac -d out --module-source-path "./*/src" $(find . -name "*.java")
使用这个命令能够同时编译多个模块，也就是说
--module-source-path中的是依赖和要编译的所有的模块源码
--module-path中是依赖的已经编译好的模块class

java -p mods/production -m eg.com.taman.hello/eg.com.taman.hello.HelloWorldApp
运行编译好的内容


$ jar --create --file mlib/eg.com.taman.hello@0.1.jar
--module-version 0.1
--main-class eg.com.taman.hello.HelloWorldApp
-C mods/eg.com.taman.hello .
java --module-path mlib -m eg.com.taman.hello

打jar包以及运行起来