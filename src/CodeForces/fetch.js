fetch('https:wwww.google.com')
.then(res => res)
.then(data => showData(data));
function showData(data){
    console.log(data);
}