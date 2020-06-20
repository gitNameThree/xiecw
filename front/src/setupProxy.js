const { createProxyMiddleware } = require('http-proxy-middleware');

module.exports = function(app) {
    app.use(
        createProxyMiddleware("/schedule", {
            target: "http://localhost:9009",
            changeOrigin: true
        })
    );
};