let http = require('http');
let url = require('url');
let path = require('path');
let server = http.createServer(function (req, res) {
    let pathname = url.parse(req.url).pathname;
    res.writeHead(200, {'Content-Type': 'application/json; charset=utf-8'});
    if (pathname === '/') {
        res.end(JSON.stringify({"index": "欢迎来到首页"}));
    } else if (pathname === '/health.json') {
        res.end(JSON.stringify({"status": "UP"}));
    } else {
        res.end("404");
    }
});
server.listen(8060,function () {
    console.log('listen on localhost:8060');
});