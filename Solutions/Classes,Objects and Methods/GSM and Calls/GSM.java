// github.com/DaniAngelov

public class GSM
{
	String model = "";
	boolean hasSimCard = false;
	String SimMobileNumber = "";
	int outgoingCallsDuration = 0;
	Call lastIncomingCall = new Call();
	Call lastOutgoingCall = new Call();
	
	
	void insertSimCard(String simMobileNumber)
	{
		
		if(simMobileNumber.length() == 10 && 
				simMobileNumber.charAt(0) == '0' &&
				simMobileNumber.charAt(1) == '8')
		{
			this.SimMobileNumber = simMobileNumber;
			this.hasSimCard = true;
		}		
	}
	
	void removeSimCard()
	{
		this.hasSimCard = false;
	}
	
	void call(GSM receiver, int duration)
	{
		if(!this.equals(receiver) && receiver.hasSimCard 
				&& this.hasSimCard && duration > 0)
		{
			this.lastOutgoingCall.duration = duration;
			receiver.lastIncomingCall.duration = duration;
			receiver.lastIncomingCall.receiver = receiver.SimMobileNumber;
			receiver.lastIncomingCall.caller = this.SimMobileNumber;
			this.lastOutgoingCall.receiver = receiver.SimMobileNumber;
			this.lastOutgoingCall.caller = this.SimMobileNumber;
			this.outgoingCallsDuration += duration;
			
			System.out.println("here");
		}
		
	}
	
	int getSumForCAll()
	{
		return this.outgoingCallsDuration * this.lastOutgoingCall.priceForAMinute;
	}
	
	
	void printInfoForTheLastOutgoingCall()

	{
		System.out.println("Information for the last outgoing call: ");
		System.out.println(this.lastOutgoingCall.caller);
		System.out.println(this.lastOutgoingCall.receiver);
		System.out.println(this.lastOutgoingCall.duration);
		System.out.println("--------------------------");
	}
	
	void printInfoForTheLastIncomingCall()
	{
		System.out.println("Information for the last outgoing call: ");
		System.out.println(this.lastIncomingCall.caller);
		System.out.println(this.lastIncomingCall.receiver);
		System.out.println(this.lastIncomingCall.duration);
		System.out.println("--------------------------");
	}
}

