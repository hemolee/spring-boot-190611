var app =  {
   // $wrapper :  "",
    $wrapper : $wrapper = document.querySelector('#wrapper'),
    init : init    
};
var customer ={
    mypage: mypage,
    login_form : login_form,
    join_form : join_form,
    join : join,
    count:count

}
   function init(){
        // $wrapper = document.querySelector('#wrapper'),
        $wrapper.innerHTML = customer.login_form();
        let join_btn = document.querySelector('#join-btn');
        join_btn.addEventListener('click',()=>{
            $wrapper.innerHTML = customer.join_form();
            document.getElementById('confirm-btn')
            .addEventListener('click', ()=>{                
                alert('조인버튼 클릭');               
                customer.join();
            });
            document.getElementById('cancel-btn')
            .addEventListener('click', ()=>{
                alert('취소버튼 클릭');
                app.init();
            });
        });
        let login_btn = document.querySelector('#login-btn');
        login_btn.addEventListener('click',e=>{ //'e'는 event라는 뜻.e를 쓰면 소괄호 생략가능 
            e.preventDefault(); //default하지말고 내가 작성한걸 실행해라
            alert('로그인 버튼 클릭');
            id = document.getElementById('customerId').value;
            pass = document.getElementById('password').value;

            let xhr = new XMLHttpRequest();
            xhr.open('GET', 'customers/'+id+'/'+pass, true);
            xhr.onload=()=>{
                if(xhr.readyState=== 4 && xhr.status === 200){
                    if(xhr.responseText){
                        $wrapper.innerHTML = customer.mypage();
                    }else{
                        app.init();
                    }
                    
                }
            };
            xhr.send();            
        });        
    };

    function join(){
        let xhr = new XMLHttpRequest()
        let data = {
            customerId : document.getElementById('customerId').value ,
            customerName : document.getElementById('customerName').value,
            password : document.getElementById('password').value,
            ssn : document.getElementById('ssn').value,
            phone : document.getElementById('phone').value,
            city : document.getElementById('city').value,
            address : document.getElementById('address').value,
            postalcode : document.getElementById('postalcode').value

            //dto와 이름이 같아야함.
        };
        xhr.open('POST','customers', true);
        xhr.setRequestHeader('Content-type','application/json; charset=utf-8;')//content-type 설정
        xhr.onload=()=>{
            if(xhr.readyState===4 && xhr.status === 200){
                let d = JSON.parse(xhr.responseText);
                if(d.result === 'success'){
                    alert('회원가입 성공'+ d.result);                   
                    app.init();
                }else{
                    alert('회원가입 실패'+ d.result);
                }               
            }else{
                alert('AJAX 실패');
            }
        };
        xhr.send(JSON.stringify(data));       //data를 스트링으로 변환해라..
    };

    function count(){
        var xhr = new XMLHttpRequest();
        xhr.open('GET', 'customers/count', true);
        xhr.onload=()=>{
            if(xhr.readyState===4 && xhr.status === 200){
                alert('성공');
                let wrapper = document.querySelector('#wrapper');
                wrapper.innerHTML = '총 고객수 : <h1>'+xhr.responseText+'</h1>'
            }
        };
        xhr.send();
    };




function mypage(){
return '<form><h1>마이페이지</h1></form> ';
};

function login_form(){
return '<form action="/action_page.php">'
+'  아이디:<br>'
+'  <input type="text" id="customerId" name="customerId">'
+'  <br>'
+'  비밀번호:<br>'
+'  <input type="text" id="password" name="password">'
+'  <br><br>'
+'  <input id="login-btn" type="button" value="LOGIN">'
+'  <input id="join-btn" type="button" value="JOIN">'
+'</form> ';
};

function join_form(){
return '<form>아이디<br>'
+'	<input type="text" id="customerId" name="customerId"><br>'
+'	비밀번호<br>'
+'	<input type="password" id="password" name="password"><br>'
+'	이름<br>'
+'	<input type="text" id="customerName" name="customerName"><br>'
+'	주민등록번호<br>'
+'	<input type="text" id="ssn" name="ssn"><br>'
+'	연락처<br>'
+'	<input type="text" id="phone" name="phone"><br>'
+'	도시<br>'
+'	<input type="text" id="city" name="city"><br>'
+'	주소<br>'
+'	<input type="text" id="address" name="address"><br>'
+'	우편번호<br>'
+'	<input type="text" id="postalcode" name="postalcode"><br>'
+'	<br>'
+'	<input id="confirm-btn" type="submit" value="확인">'
+'	<input id="cancel-btn" type="reset" value="취소">'
+'</form>';
}//태그에 id를 주는 것은 dom객체화