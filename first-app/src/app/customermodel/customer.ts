export class Customer {
    constructor(
      public id: number,
      public name: string,
      public account: Account
    ) {}
    toString() {
      return (
        'id : ' +
        this.id +
        ' ' +
        'name : ' +
        this.name +
        ' ' +
        'account : ' +
        this.account +
        ' '
      );
    }
  }
  
  export class Account {
    constructor(public balance: number) {}
    toString() {
      return 'balance : ' + this.balance;
    }
  }
  
  export class PrimeAccount extends Account {
    constructor(public balance: number, public supercoins: number) {
      super(balance);
    }
    toString() {
      return 'balance: ' + this.balance + ' ' + 'supercoins: ' + this.supercoins;
    }
  }