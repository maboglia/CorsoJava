
#JavaScript : Click to set paragraph background color

```html     
<!DOCTYPE html>
<html>
<head>
<meta charset=utf-8 />
<title>JS Bin</title>
</head>
<body>
<input type="button" value="Click to set paragraph background color" onclick="set_background()">
  <p>w3resource JavaScript Exercises</p>
  <p>w3resource PHP Exercises</p>  
<script id="jsbin-javascript">
function set_background() {
 docBody = document.getElementsByTagName("body")[0];
  //Get all the p elements that are descendants of the body
  myBodyElements = docBody.getElementsByTagName("p");
// get the first p elements
  myp1 = myBodyElements[0];
  myp1.style.background = "rgb(255,0,0)";
// get the second p elements
  myp2 = myBodyElements[1];
  myp2.style.background = "rgb(255,255,0)";
}
</script>
</body>
</html>
```     



#JavaScript : Collect the value of href, hreflang, rel, target, and type attributes of a link

```html
view plaincopy to clipboardprint?

    <!DOCTYPE html>   
    <html>   
    <head>   
    <meta charset=utf-8 />   
    <title>JS Bin</title>   
    </head>   
    <body>   
    <p><a id="w3r" type="text/html" hreflang="en-us" rel="nofollow" target="_self" href="http://www.w3resource.com/">w3resource</a></p>   
    <button onclick="getAttributes()">Click here to get the attribute's value</button>    
    </body>   
    </html>  
```     

```javascript
view plaincopy to clipboardprint?

    function getAttributes()  
    {  
     var u = document.getElementById("w3r").href;  
     alert('The value of the href attribute of the link is : '+u);  
     var v = document.getElementById("w3r").hreflang;     
     alert('The value of the hreflang attribute of the link is : '+v);  
     var w = document.getElementById("w3r").rel;   
      alert('The value of the rel attribute of the link is : '+w);  
     var x = document.getElementById("w3r").target;   
      alert('The value of the taget attribute of the link is : '+x);  
     var y = document.getElementById("w3r").type;   
      alert('The value of the type attribute of the link is : '+y);    
    }  

```     

#JavaScript : JavaScript function to add rows to a table
Sample Solution :

```html
view plaincopy to clipboardprint?

    <!DOCTYPE html>   
    <html><head>   
    <meta charset=utf-8 />   
    <title>Insert row in a table - w3resource</title>   
    </head><body>   
    <table id="sampleTable" border="1">   
    <tr><td>Row1 cell1</td>   
    <td>Row1 cell2</td></tr>   
    <tr><td>Row2 cell1</td>   
    <td>Row2 cell2</td></tr>   
    </table><br>   
    <input type="button" onclick="insert_Row()" value="Insert row">    
    </body></html>  
```     

```javascript
view plaincopy to clipboardprint?

    function insert_Row()  
    {  
    var x=document.getElementById('sampleTable').insertRow(0);  
    var y = x.insertCell(0);  
    var z = x.insertCell(1);  
    y.innerHTML="New Cell1";  
    z.innerHTML="New Cell2";  
    }  
```     



#JavaScript : Write a function to create a user defined table, accepting rows and columns


```html
view plaincopy to clipboardprint?

    <!DOCTYPE html>   
    <html>   
    <head>   
    <meta charset=utf-8 />   
    <title>Create a table</title>   
    <style type="text/css">   
    body {margin: 30px;}   
    </style>    
    </head><body>   
    <table id="myTable" border="1">   
    </table><form>   
    <input type="button" onclick="createTable()" value="Create the table">   
    </form></body></html>  
```     

```javascript
view plaincopy to clipboardprint?

    function createTable()  
    {  
    rn = window.prompt("Input number of rows", 1);  
    cn = window.prompt("Input number of columns",1);  
        
     for(var r=0;r<parseInt(rn,10);r++)  
      {  
       var x=document.getElementById('myTable').insertRow(r);  
       for(var c=0;c<parseInt(cn,10);c++)    
        {  
         var y=  x.insertCell(c);  
         y.innerHTML="Row-"+r+" Column-"+c;   
        }  
       }  
    }  
```     


#JavaScript : Remove items from a dropdown list

```html
view plaincopy to clipboardprint?

    <!DOCTYPE html>   
    <html>   
    <head>   
    <style type="text/css">   
    body {margin: 30px;}   
    </style>    
    <meta charset=utf-8 />   
    <title>Remove items from a dropdown list</title>   
    </head><body><form>   
    <select id="colorSelect">   
    <option>Red</option>   
    <option>Green</option>   
    <option>White</option>   
    <option>Black</option>   
    </select>   
    <input type="button" onclick="removecolor()" value="Select and Remove">   
    </form></body></html>  
```     

```javascript
view plaincopy to clipboardprint?

    function removecolor()  
    {  
    var x=document.getElementById("colorSelect");  
    x.remove(x.selectedIndex);  
    }     
```     