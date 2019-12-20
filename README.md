启动`jetty`服务器：

```bash
$ mvn jetty:run
```

测试请求：

```bash
$ http localhost:8080/app/forward
HTTP/1.1 200 OK
Content-Length: 14
Content-Type: text/plain;charset=utf-8
Date: Fri, 20 Dec 2019 10:21:27 GMT
Server: Jetty(9.4.17.v20190418)

forwarded: foo
```

可以看到`internalDispatcher`把请求转发给了`foo`。
