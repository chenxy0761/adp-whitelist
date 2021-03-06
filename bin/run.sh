#!/bin/bash
source /etc/profile
source ~/.bash_profile
#项目所在的路径
base_path="/data2/u_lx_tst2/scala_test"
#项目名称
project_name="adp-whitelist"

#使用maven进行打包，并将打好的包放到lib下
function package(){
 cd ${base_path}/${project_name}
 mvn -o clean package > ${base_path}/log/package.log
 cd ${base_path}/${project_name}/target
 unzip adp-whitelist-1.0-SNAPSHOT-distribution.zip
 cp adp-whitelist-1.0-SNAPSHOT.jar adp-whitelist-1.0-SNAPSHOT/lib/
}

#传入要运行的包名类名，执行程序
function execute() {
 class=$1
 scala -cp ${base_path}/${project_name}/target/adp-whitelist-1.0-SNAPSHOT/lib/*:. ${class}
}

#发布到spark客户端
function deploy() {
 
}

#程序入口 传入参数 <package> 进行打包;传入参数 <execute> <class>进行测试;<deploy> 发布到指定路径
case $1 in
 package)
  package
 ;;
 execute)
  shift
  execute $1
 ;;
 deploy)
  deploy
 ;;
 *)
 	echo "Usage: sh $0 <package> | <execute> <class> | <deploy>"
 ;;
esac
