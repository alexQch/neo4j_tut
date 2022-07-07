module.exports = {      
    devServer: {                //webpack-dev-server配置        //配置本项目运行端口
        proxy: {                //配置代理服务器来解决跨域问题
            '/': {
                target: 'http://localhost:18071/',      //配置要替换的后台接口地址
                changOrigin: true,                      //配置允许改变Origin
                pathRewrite: {
                    '^/': ''
                }
            }
        }
    }
  }
  