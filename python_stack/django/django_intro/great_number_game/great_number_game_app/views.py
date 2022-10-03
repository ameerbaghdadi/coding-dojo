from django.shortcuts import render, redirect, HttpResponse
import random

def mainPage(request):
    random_number =  random.randint(1, 100)
    if random_number not in request.session:
        request.session['random_number'] = random_number
    print(random_number)
    return render(request, 'show.html')

def submited_number(request):
    random_guess = request.POST['submited']
    request.session['random_guess'] = random_guess
    print(random_guess)

    if request.session['random_number'] > int(request.POST['submited']):
        request.session['result'] = 'too low'
    elif request.session['random_number'] < int(request.POST['submited']):
        request.session['result'] = 'too high'
    else:
        request.session['result'] = 'equal'

    return redirect('/')

def delete (request):
    del request.session['result']
    del request.session['random_guess']
    del request.session['random_number']

    return redirect('/')