/**
    public void splice(QueueInterface<T> anotherQueue)
    {
        QueueInterface<T> copyQueue = anotherQueue;
        QueueInterface<T> fixQueue = new LinkedQueue();

        if(isEmpty())
        {
            while(!copyQueue.isEmpty())
            {
                fixQueue.enqueue(copyQueue.getFront());
                enqueue(copyQueue.dequeue());
            }
        }
        else if(!isEmpty())
        {
            while(!copyQueue.isEmpty())
            {
                fixQueue.enqueue(copyQueue.getFront());
                enqueue(copyQueue.dequeue());
            }
        }

        while(!fixQueue.isEmpty())
        {
            anotherQueue.enqueue(fixQueue.dequeue());
        }
    }

    public void splice(LinkedQueue anotherQueue)
    {
        Node current = firstNode;
        Node anotherCurrent = anotherQueue.getFrontNode();

        if(isEmpty())
        {
            if(!anotherQueue.isEmpty())
            {
                firstNode = anotherCurrent;
            }
        }
        else if(!isEmpty())
        {
            if(anotherCurrent != null)
            {
                lastNode.next = anotherCurrent;
                while(anotherCurrent.next != null)
                {
                    anotherCurrent = anotherCurrent.next;
                }
                lastNode = anotherCurrent;
            }
        }
    }

	public Node getFrontNode()
