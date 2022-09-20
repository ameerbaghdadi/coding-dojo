from turtle import color
from flask import Flask, render_template
app = Flask(__name__)

@app.route('/')
def display8x8():
    return render_template('index.html', x_axis = 8 , y_axis = 8, x_color = "black", y_color = "red" )

@app.route('/4')
def display4x():
    return render_template('index.html', x_axis = 4 , y_axis = 8, x_color = "black", y_color = "red" )

@app.route('/<int:x>/<int:y>')
def displayxy(x,y):
    return render_template('index.html', x_axis = x , y_axis = y, x_color = "black", y_color = "red" )


@app.route('/<int:x>/<int:y>/<colorx>/<colory>')
def display(x,y,colorx,colory):
    return render_template('index.html', x_axis = x, y_axis = y, x_color = colorx, y_color = colory)

if __name__ == "__main__":
    app.run(debug=True)