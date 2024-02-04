// web worker是一个独立的进程，不能操作DOM和BOM
// 适合做大量的计算
let total = 0
        for(var i = 0; i < 100000000; i++){
            total += i
        }
        console.log(total)

// 发消息给主线程，提交结果
self.postMessage({total : total}) 