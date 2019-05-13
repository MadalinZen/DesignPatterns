package DesignPatterns.Proxy;

 /*
    1. What is Proxy/Agent pattern?

I’m too busy to response your request, so you go to my proxy.
Proxy should know what the delegator can do. That is, they have the same interface. The proxy can not do the job, but the delegator can do. The characters you do not understand can be totally ignored!

2. Proxy pattern story

Here is a funny story I translated from "Water Margin".
 It may not sounds funny any more after I translate it. But any way, you get the idea of proxy design pattern.

Here is the situation:

Some bad man, for whatever reasons, always wants to sleep with some good man's wife.
 Among those wives, some want to sleep with those bad men, but others do not.
 The bad men can not ask directly to those wives.
 Because they are not sure whether the one being asked would like to do bad things.
 It would be a very bad situation if he makes a bad judgement.
 So there should be an agent/proxy to do this kind of business for those bad men.

We have the following roles in this situation.

CheatingWife/SluttyWife: a interface which define what they usually do, such as seduce men and happy with men.
HouseWifeOne: she is a slutty wife at home.
Mike: who wants to sleep with other men’s wives.
Business Agent: do this kind of consulting business.

1. Define the cheating wife’s type
2. define a cheating wife No. 1
3. Define the bad agent
4. Let the bad men start doing bad things
     */


interface CheatingWife {

    // think about what this kind of women can do

    public void seduceMan(); // such an eye contact with men

    public void happyWithMan(); // happy what ? you know that



}
