function submitUsr() {
    console.log("ok");
    window.frames[0].postMessage({username: "weixingyue", password: "Avaya123"}, "https://localhost:8082");


}

