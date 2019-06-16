var app = ( () => {
    // console.log('ggg');
    let init =  () => { //맨처음에 보여줄 화면
        login_form(); //login_form은 private 메소드가 되었다.

    };
    let login_form =  () => {
        let wrapper = document.querySelector('#wrapper'); //document = html 전체 하나. wrapper는 DOM객체(id나 class있는 것). 
        wrapper.innerHTML = '<form action="/action_page.php">'
            // + '<div id="target">'
     
            + '  First name:<br>'
            + '  <input type="text" name="firstname" value="Mickey">'
            + '  <br>'
            + '  Last name:<br>'
            + '  <input type="text" name="lastname" value="Mouse">'
            + '  <br><br>'
            + '  <input type="submit" id=btn_login value="Login">' 
            + '  <input type="button" id=btn_join value="Join">'
            // + '</div>'
            + '</form> ';

        // var btn = document.querySelector('#btn');
        // var target = document.getElementById('target');
        // btn.addEventListener('click', function () {
        //     //   document.getElementById('target').innerHTML =' ';
        //     target.innerHTML = ' ';
        // });
        // var btn2 = document.querySelector('#btn2');

        // btn2.addEventListener('click', function () {
        //     var temp = document.createTextNode('새로 추가됨');
        //     target.appendChild(temp);
        // });
        let btn_join = document.querySelector('#btn_join');
        btn_join.addEventListener('click',  () => {
            join_form();
        });
        let btn_login = document.querySelector('#btn_login');
        btn_login.addEventListener('click',(e)=>{
            e.preventDefault();
            alert('로그인 버튼 클릭');
            count();
        });
    }

        let count =()=>{            
            let xhr = new XMLHttpRequest();
            method = 'GET';
            url = 'count';
            xhr.open(method, url, true);
            xhr.onreadystatechange=()=>{
                if(xhr.readyState === 4 && xhr.status === 200){ //this.status 로 쓰려면 람다대신 function으로..
                    alert('성공');
                    let wrapper = document.querySelector('#wrapper');
                    wrapper.innerHTML = '총 고객수 : <h1>' + xhr.responseText + '</h1>'    //function일땐 this.responsetext                
                }
            }
            
            xhr.send();
        }

        let join_form = () => {
            let wrapper = document.querySelector('#wrapper');
            wrapper.innerHTML =
             '<form action="/action_page.php">'
             + '  id:<br>'
             + '  <input type="text" name="id" value="id">'
             + '  <br>'
             + '  pw:<br>'
             + '  <input type="text" name="pw" value="pw">'
             + '  <br>'
             + '  name:<br>'
             + '  <input type="text" name="c_name" value="name">'
             + '  <br>'
             + '  birth:<br>'
             + '  <input type="text" name="birth" value="birth">'
             + '  <br>'
             + '  phone:<br>'
             + '  <input type="text" name="phone" value="phone">'
             + '  <br><br>'
             + '  <input type="submit" id="btn_confirm" value="확인">'
            //  + '  <input type="reset" id="btn_cancel" value="취소">'
             +'</form> '
       
   
        let btn_confirm = document.querySelector('#btn_confirm');
        btn_confirm.addEventListener('click', () => {
            login_form();
        });
    }

    return {
        aa: init  //init은 public 메소드가 되었다
    };
})(); //();  끝에 이부분이 '즉시 실행해라' 라는 것