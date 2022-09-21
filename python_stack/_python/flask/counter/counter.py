from typing import no_type_check
from flask import Flask, render_template, request, redirect, session

app = Flask(__name__)
app.secret_key = 'keep it secret, keep it safe' # set a secret key for security purposes

@app.route('/')
def index():
    
    return render_template("index.html")

# @app.route('/', methods=['POST'])
# def create_user():
#     print("Got Post Info")
#     # Here we add two properties to session to store the name and email
#     session['times'] = request.form['name']
#     session['yourlocation'] = request.form['location']
#     session['yourlanguage'] = request.form['language']
#     session['fav_language'] = request.form['fav_language']
#     session['status'] = request.form['status']
#     session['yourcomment'] = request.form['comment']
#     return redirect('/result')

# @app.route('/result')
# def show_user():
#     return render_template('result.html', name = session['name'], location = session['yourlocation'], language = session['yourlanguage'], comment = session['yourcomment'])

if __name__ == "__main__":
    app.run(debug=True)