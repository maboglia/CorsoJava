class Card{

   private int skiliftId;
   private long time;
   // private long cardId;

   public Card(int skiliftId, long time){
      this.newPassage(skiliftId, time);
   }

   public void newPassage(int skiliftId, long time){
      this.skiliftId = skiliftId;
      this.time = time; 
   
   }

   public int getLastLift(){ return this.skiliftId; }
   public long getLastTime(){ return this.time; }
}