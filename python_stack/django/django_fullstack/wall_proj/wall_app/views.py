from django.shortcuts import render, redirect
from wall_app.models import *

def wall(request):
    if 'user_id' in request.session:
        context={
            'user':User.objects.get(id=request.session['user_id']),
            'messages':Message.objects.all().order_by("-created_at"),
        }
        return render(request,'wall.html',context)
    else:
        return redirect('/')

def postMessage(request):
    message = request.POST['postmessage']
    user = User.objects.get(id=request.session['user_id'])
    Message.objects.create(user = user, message = message)
    
    return redirect('/')

def postComment(request):
    comment = request.POST['postcomment']
    user = User.objects.get(id=request.session['user_id'])
    message=Message.objects.get(id=request.POST['message_id'])
    Comment.objects.create(comment = comment, user = user, message=message)

    return redirect('/')