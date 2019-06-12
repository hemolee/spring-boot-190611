var app = (function () {
    // console.log('ggg');
    let init = function () {
        login_form(); //login_form은 private 메소드가 되었다.

    };
    let login_form = function () {
        var wrapper = document.querySelector('#wrapper'); //document = html 전체 하나
        wrapper.innerHTML = +'<form action="/action_page.php">'
            + '<div id="target">'
            + '  First name:<br>'
            + '  <input type="text" name="firstname" value="Mickey">'
            + '  <br>'
            + '  Last name:<br>'
            + '  <input type="text" name="lastname" value="Mouse">'
            + '  <br><br>'
            + '  <input type="submit" value="로그인">'
            + '  <input type="button" id=btn3 value="회원가입">'
            + '</div>'
            + '</form> ';

        // var btn = document.querySelector('#btn');
        var target = document.getElementById('target');
        // btn.addEventListener('click', function () {
        //     //   document.getElementById('target').innerHTML =' ';
        //     target.innerHTML = ' ';
        // });
        // var btn2 = document.querySelector('#btn2');

        // btn2.addEventListener('click', function () {
        //     var temp = document.createTextNode('새로 추가됨');
        //     target.appendChild(temp);
        // });
        var btn3 = document.querySelector('#btn3');
        btn3.addEventListener('click', function () {
            // join_form();
            wrapper.innerHTML =
             +'<form action="/action_page.php">'
             + '  id:<br>'
             + '  <input type="text" name="id" value="id">'
             + '  <br>'
             + '  pw:<br>'
             + '  <input type="text" name="pw" value="pw">'
             + '  <br>'
             + '  name:<br>'
             + '  <input type="text" name="c_name" value="name">'
             + '  <br>'
             + '  ssm:<br>'
             + '  <input type="text" name="ssm" value="ssm">'
             + '  <br>'
             + '  phone:<br>'
             + '  <input type="text" name="phone" value="phone">'
             + '  <br><br>'
             + '  <input type="submit" id="btn_join" value="확인">'
             +'</form> '
        });
   
        var btn_join = document.querySelector('#btn_join');
        btn_join.addEventListener('click', function () {
            // login_form();
            wrapper.innerHTML = +'<form action="/action_page.php">'
            + '<div id="target">'
            + '  First name:<br>'
            + '  <input type="text" name="firstname" value="Mickey">'
            + '  <br>'
            + '  Last name:<br>'
            + '  <input type="text" name="lastname" value="Mouse">'
            + '  <br><br>'
            + '  <input type="submit" value="로그인">'
            + '  <input type="button" id=btn3 value="회원가입">'
            + '</div>'
            + '</form> ';
        });
    }

    return {
        aa: init  //init은 public 메소드가 되었다
    };
})(); //();  끝에 이부분이 '즉시 실행해라' 라는 것