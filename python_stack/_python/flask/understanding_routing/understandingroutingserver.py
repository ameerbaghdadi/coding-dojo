from cgitb import reset
from unicodedata import name
from unittest import result
from flask import Flask  # Import Flask to allow us to create our app
app = Flask(__name__)    # Create a new instance of the Flask class called "app"


@app.route('/')          # The "@" decorator associates this route with the function immediately following
def hello_world():
    return 'Hello World!'  # Return the string 'Hello World!' as a response

@app.route('/dojo')          
def dojo():
    return 'dojo'

@app.route('/say/<name>') # for a route '/hello/____' anything after '/hello/' gets passed as a variable 'name'
def hello(name):
    print(name)
    return "Hello, " + name

@app.route('/repeat/<int:num>/<name>') # for a route '/hello/____' anything after '/hello/' gets passed as a variable 'name'
def repeat(num, name):
    str = ""
    for i in range(0, num):
        str += name + "<br>"
    return str
    # x = int(num) * name 
    # return ('<br>' + x)

@app.route('/<x>') # for a route '/hello/____' anything after '/hello/' gets passed as a variable 'name'
def check(x):
    if (x!="repeat" or x!="say"): 
        return ("Sorry") 

if __name__=="__main__":   # Ensure this file is being run directly and not from a different module    
    app.run(debug=True)    # Run the app in debug mode.
