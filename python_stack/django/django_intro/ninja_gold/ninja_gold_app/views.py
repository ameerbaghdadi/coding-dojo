from multiprocessing import context
from time import strftime
from django.shortcuts import render, redirect
import random
from time import gmtime, localtime, strftime

# Create your views here.
def display(request):
    if 'gold' not in request.session:
        request.session['gold'] = 0
    if 'activity' not in request.session:
        request.session['activity'] = []
    return render(request, 'index.html')

def submited(request):
    if request.POST['place'] == 'quest':
        random_number =  random.randint(-50, 50)
        request.session['gold'] += random_number
        context_quest = {
            'status': f"win" if random_number > 0 else "loose",
            'message': f"you completed a quest and earned {random_number} gold. ({strftime('%B %d %Y %H:%M %p', localtime())})" 
            if random_number > 0 else f"you failed a quest and lost {(random_number) * -1} gold. Ouch ({strftime('%B %d %Y %H:%M %p', localtime())})"
        }
        if random_number > 0:
            request.session['activity'].insert(0, context_quest)
        elif random_number < 0:
            request.session['activity'].insert(0, context_quest)

    elif request.POST['place'] == 'farm':
        random_number =  random.randint(10, 20)
        request.session['gold'] += random_number
        context_farm = {
            'status': f"win",
            'message':  f"you entered a farm and earned {random_number} gold. ({strftime('%B %d %Y %H:%M %p', localtime())})"
        }
        request.session['activity'].insert(0, context_farm)

    elif request.POST['place'] == 'cave':
        random_number =  random.randint(10, 20)
        request.session['gold'] += random_number
        context_cave = {
            'status': f"win",
            'message':  f"you entered a cave and earned {random_number} gold. ({strftime('%B %d %Y %H:%M %p', localtime())})"
        }
        request.session['activity'].insert(0, context_cave)
    elif request.POST['place'] == 'house':
        random_number =  random.randint(10, 20)
        request.session['gold'] += random_number
        context_house = {
            'status': f"win",
            'message': f"you entered a house and earned {random_number} gold. ({strftime('%B %d %Y %H:%M %p', localtime())})"
        }
        request.session['activity'].insert(0, context_house)

    return redirect('/')