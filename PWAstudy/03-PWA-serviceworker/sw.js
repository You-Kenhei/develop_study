self.addEventListener('install', event => {
    console.log("install",event)

    // skip waiting, to activate next serviceWorker
    // event.waitUntil to make sure skipWaiting is done
    event.waitUntil(self.skipWaiting())
})

self.addEventListener('activate', event => {
    console.log("activate",event)
    
    // 
    event.waitUntil(self.clients.claim())
})

self.addEventListener('fetch', event => {
    console.log("fetch",event)
    
})