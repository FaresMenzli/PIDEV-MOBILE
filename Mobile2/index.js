const mysql = require('mysql2') ;

const connection =mysql.createConnection({
host : 'localhost',
user : 'root',
password : '',
database : 'coviday'

});

var express = require('express')
var app = express()

 app.get('/',function (req, res){
    connection.query(
        'SELECT * FROM `question`',
        
        function(err,results){
            if (err) res.send(err)
            
            else {res.json(results)
            }
            
        }
    );
}) ;
app.get('/:id',function (req, res){
    let id =req.params.id
    connection.query(
        "SELECT * FROM `question` WHERE Q_id="+id,
        
        function(err,results){
            if (err) res.send(err)
            
            else {res.json(results)
            }
            
        }
    );
}) ;
app.post('/post/:i/:reponse',function (req, res){
    let rep = req.params.reponse
    let Question_id = req.params.i
    connection.query(
        "insert into reponse ( id_Q , rep) values("+Question_id+",'"+rep+"');",

        function(err,results){
            if (err) res.send(err)
            
            else {res.json(results)
            console.log(results)} }
    )

})

/* connection.connect(function(err) {
    if (err) console.error(err) ;
    console.log("Connected!");
   
    
  });  */
app.listen(5000,err=>err ? console.log(err):console.log("connected sur le port 5000"))

