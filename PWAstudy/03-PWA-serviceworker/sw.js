self.addEventListener('install', event => {
    console.log("安装")

})

self.addEventListener('activate', event => {
    console.log("激活")
    
})

self.addEventListener('fetch', event => {
    console.log("捕捉")
    
})