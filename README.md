# springboot-myp-mppdb
链接华为mppdb数据库 详细查看文档
1.登录用户 切换omm 用户 

以操作系统用户omm登录CN所在服务器，执行source ${BIGDATA_HOME}/mppdb/.mppdbgs_profile命令启动环境变量。

若不确定CN位于哪台服务器，请参考确认连接信息。


连接数据库。

gsql -d postgres -p 25308连接成功后，系统显示类似如下信息：

gsql ((Gauss200 OLAP V100R007C10 build 4a33de3b) compiled at 2018-07-02 10:35:32 commit 1683 last mr 2229)
Non-SSL connection (SSL connection is recommended when requiring high-security)
Type "help" for help.

postgres=#其中，postgres为集群安装完成后，默认生成的数据库。初始可以连接到此数据库进行新数据库的创建。25308为CN的端口号，需根据实际情况做替换。

引申信息：

使用数据库前，均需要先使用客户端程序或工具连接到数据库。然后就可以通过客户端程序或工具下发SQL来使用数据库了。

gsql是本产品提供的在命令行下运行的数据库连接工具。更多的数据库连接办法可参考连接数据库。


创建数据库用户。

默认只有集群安装时创建的管理员用户可以访问初始数据库。您还可以创建其他数据库用户帐号：

CREATE USER joe WITH PASSWORD "Bigdata@123";当结果显示为如下信息，则表示创建成功。

CREATE ROLE上面，创建了一个用户名为joe，密码为Bigdata@123的用户。

引申信息：

关于创建用户的更多信息请参考创建用户并分配权限。


创建数据库。

 CREATE DATABASE db_tpcds;当结果显示为如下信息，则表示创建成功。

CREATE DATABASE创建完db_tpcds数据库后，就可以按如下方法退出postgres数据库，使用新用户连接到此数据库执行接下来的创建表等操作。当然，也可以选择继续在默认的postgres数据库下做后续的体验。

