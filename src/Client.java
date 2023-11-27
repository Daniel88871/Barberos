public class Client extends Thread {
    private Sala llocTreball;
    private int idClient;
    private boolean tall = false;

    public Client(Sala llocTreball, int idClient){
        this.llocTreball = llocTreball;
        this.idClient = idClient;
    }

    public void run(){
        for(;;){
            try{
                Thread.sleep(2000);
                tall = llocTreball.entra(idClient);
                if(tall){
                    Thread.sleep(10000);
                }
                else{
                    Thread.sleep(4000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}