class Customer{
    id;
    name;
    account;
    constructor(id,name,account){
    this.id=id;
    this.name=name;
    this.account=account;
    }
    
    toString(){
     let text=this.id+" "+this.name+" "+this.account;
     return text;
    }
    }
    
    class Account{
    balance;
    
    constructor(balance){
        this.balance=balance;
    }
    toString(){
        let text=this.balance;
     return text;
    }
    } 
    class PrimeAccount extends Account{
        supercoins;
    
        constructor(balance,supercoins){
            super(balance);
            this.supercoins=supercoins;
        }
        toString(){
            let text=this.balance+" "+this.supercoins;
         return text;
        }  
    }
    
    let acc1 = new Account(20000);
    let acc2 = new Account(25000);

    let primeAcc1 = new PrimeAccount(30000, 100);
    let primeAcc2 = new PrimeAccount(50000, 300);

    let customer1 = new Customer(1, "Thomas", acc1);
    let customer2 = new Customer(2, "Eric", acc2);
    let customer3 = new Customer(3, "Lucy", primeAcc1);
    let customer4 = new Customer(4, "john", primeAcc2);

    let customers = [customer1, customer2, customer3, customer4];

    for(let i=0; i<customers.length; i++){
        console.log("customer = "+customers[i].toString());
    }

    
    
    
    
    
    
    
    