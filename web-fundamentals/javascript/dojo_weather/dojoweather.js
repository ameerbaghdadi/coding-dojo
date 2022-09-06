
var element = document.querySelector(".third");
function hide() 
{
    element.remove();
}


    function change(){
    var v=document.querySelector(".cf").value;
    console.log(v);

    var x1=document.getElementById('high1').innerText;
        
    var y1=document.getElementById('low1').innerText;
        
    var x2=document.getElementById('high2').innerText;
    
    var y2=document.getElementById('low2').innerText;
    
    var x3=document.getElementById('high3').innerText;
        
    var y3=document.getElementById('low3').innerText;

    var x4=document.getElementById('high4').innerText;
        
    var y4=document.getElementById('low4').innerText;
    console.log(y4);
   
        if (v=="Fahrenheit")
        {
            x1=Math.floor(x1*1.8+32);
            document.getElementById('high1').innerText=x1;
            y1=Math.floor(y1*1.8+32);
            document.getElementById('low1').innerText=y1;
            x2=Math.floor(x2*1.8+32);
            document.getElementById('high2').innerText=x2;
            y2=Math.floor(y2*1.8+32);
            document.getElementById('low2').innerText=y2;
            x3=Math.floor(x3*1.8+32);
            document.getElementById('high3').innerText=x3;
            y3=Math.floor(y3*1.8+32);
            document.getElementById('low3').innerText=y3;
            x4=Math.floor(x4*1.8+32);
            document.getElementById('high4').innerText=x4;
            y4=Math.floor(y4*1.8+32);
            document.getElementById('low4').innerText=y4;
            
        }


        if (v=="Celsius")
        {
            x1=Math.floor((x1-32)/1.8);
            document.getElementById('high1').innerText=x1;
            y1=Math.floor((y1-32)/1.8);
            document.getElementById('low1').innerText=y1;
            x2=Math.floor((x2-32)/1.8);
            document.getElementById('high2').innerText=x2;
            y2=Math.floor((y2-32)/1.8);
            document.getElementById('low2').innerText=y2;
            x3=Math.floor((x3-32)/1.8);
            document.getElementById('high3').innerText=x3;
            y3=Math.floor((y3-32)/1.8);
            document.getElementById('low3').innerText=y3;
            x4=Math.floor((x4-32)/1.8);
            document.getElementById('high4').innerText=x4;
            y4=Math.floor((y4-32)/1.8);
            document.getElementById('low4').innerText=y4;
         
        }

    
}