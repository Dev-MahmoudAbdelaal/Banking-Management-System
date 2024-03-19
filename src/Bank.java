public class Bank {
    private Account []accounts;
    private int numAcounts;
    private static final int Max_Accounts=100;

    public Bank() {
        accounts=new Account[Max_Accounts];
        numAcounts=0;
    }

    public Account getAccount(String userName){
        for (int i = 0; i < numAcounts; i++) {
            if(accounts[i].getUserName().equals(userName)){
                return accounts[i];

            }
        }
        System.out.println("Account doesn't exist");
        return null;
    }

    public void createAccount(String userName){
        if (getAccount(userName)==null) {
                if(numAcounts<Max_Accounts){
                accounts[numAcounts++]=new Account(userName);
                System.out.println("Account created successfully.");
                }else{
                System.out.println("Account number already exists.");
                }
                
            }
            
    }

}
