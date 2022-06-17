// BackEnd URL
const BASE_URL = "http://localhost:9090/api";

// UI URL
const UI_URL = "http://localhost:8080/FrontEnd";

//*****************************LOGIN*******************************************

function doLogin() {

	const email = document.getElementById('email').value;
	const pass = document.getElementById('pass').value;

	//TODO : add validation for each field
	const loginObj = {};

	loginObj.email = email;
	loginObj.password = pass;

	checkLogin(loginObj);

}
async function checkLogin(loginObj) {
	const url = BASE_URL + '/login';

	const data = {
		method: 'POST',
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(loginObj)
	};
	const rawResponse = await fetch(url, data);
	const customer = await rawResponse.json();
    if (customer) {
		alert('Login Successful');
		localStorage.setItem("ACC_NUM", customer.accountNo);
		localStorage.setItem("FIRST", customer.firstName);
		localStorage.setItem("LAST", customer.lastName);
		localStorage.setItem("ACC_BAL", customer.balance);
	window.location.href = UI_URL + '/dashBoard.html';

	}
	else {
		
		 alert('Login failed'); 
	}

	console.log(content);
}

//*****************************REGISTER*******************************************

function validate() {

	const firstName = document.getElementById('firstName').value;
	const lastName = document.getElementById('lastName').value;
	const email = document.getElementById('email').value;
	const phone = document.getElementById('phone').value;
	const dob = document.getElementById('dob').value;
	const pass = document.getElementById('pass').value;
	const cpass = document.getElementById('cpass').value;
	const accountType = document.getElementById('accountType').value;
	
	
	 var mailformat = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
     const regex = "(0/91)?[7-9][0-9]{9}";
     const reg = /^\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$/;
            if (!firstName) {
                alert('please enter your FirstName');
                return;
            }
           else if (!lastName) {
                alert('please enter your LastName');
                return;
            }
            else if (!email) {
                alert('please enter your email');
                return;
            }
           else if(!email.match(mailformat)){
                alert('Invalid email');
                return;
            }
            else if (!phone) {
                alert('please enter your Phone Number');
                return;
            }
             else if(!phone.match(regex)){
                alert('Invlid Phone Number ');
                return;
            }
            else if(!dob)
            {
            alert('please enter Your date of birth');
            }
            else if(!dob.match(reg))
            {
            alert('Invalid Date of Birth');
            }
           
            else if (!pass) {
                alert('please enter your password');
                return;
            }
            else if (!cpass) {
                alert('please enter your confirm password');
                return;
            }
            else if ( pass != cpass) {
                alert('passwords are not matched');
                return;
            }
            else{
	const customerObj = {};
	customerObj.firstName = firstName;
	customerObj.lastName = lastName;
	customerObj.email = email;
	customerObj.phone = phone;
	customerObj.password = pass;
	customerObj.dob = dob;
	customerObj.accountType = accountType;
  
	addCustomer(customerObj);
	            }
	             //openAccount();
}

function openAccount() {

	const firstName = document.getElementById('firstName').value;
	const lastName = document.getElementById('lastName').value;
	const email = document.getElementById('email').value;
	const phone = document.getElementById('phone').value;
	const dob = document.getElementById('dob').value;
	const pass = document.getElementById('pass').value;
	const cpass = document.getElementById('cpass').value;
	const accountType = document.getElementById('accountType').value;
	
   	const customerObj = {};
	customerObj.firstName = firstName;
	customerObj.lastName = lastName;
	customerObj.email = email;
	customerObj.phone = phone;
	customerObj.password = pass;
	customerObj.dob = dob;
	customerObj.accountType = accountType;
  
	addCustomer(customerObj);
	

}
async function addCustomer(customerObj) {
	const url = BASE_URL + '/customer';

	const data = {
		method: 'POST',
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(customerObj)
	};
	const rawResponse = await fetch(url, data);
	const customer = await rawResponse.json();
	
	if(customer) {
		alert('Registraion Successful');
		window.location.href = UI_URL + '/login.html';
	}
	else { alert('Login failed'); }

	console.log(content);
}

//*****************************ACCOUNT NUMBER*******************************************

function fetchAccountNum() {
	const span = document.getElementById('accountNum');
	const accountNumber = localStorage.getItem("ACC_NUM");
	span.innerHTML = accountNumber;

}

//*****************************ACCOUNT NAME*******************************************

function fetchName() {
	const adi = document.getElementById('fullName');
	var firstname = localStorage.getItem("FIRST");
	var lastname = localStorage.getItem("LAST");
	var fullname=firstname+" "+lastname;

	adi.innerHTML =fullname ;

}

//*****************************BALANCE*******************************************

function checkBalance(){
        const accountBal = localStorage.getItem("ACC_BAL");
    
        const button = document.getElementById('cb');
        button.innerHTML = 'Balance : '+accountBal;
}
/*function fetchBalance1() {
	alert("you enterd");
	const span = document.getElementById('bal');
	const amt = localStorage.getItem("BAL");
	
	span.innerHTML = amt;

}*/

//*****************************DEPOSITE*******************************************

function deposite() {

	const accountNum = document.getElementById('accNum').value;
	const amount = document.getElementById('amount').value;
	const source = document.getElementById('source').value;
	const remark = document.getElementById('remark').value;
   if(amount<=0)
	{
		alert("Negative Balance Not Allowed!!!");
		return;
	}

	const transactionObj = {}
	transactionObj.accountNum = accountNum;
	transactionObj.amount = amount;
	transactionObj.source = source;
	transactionObj.remark = remark;
	transactionObj.type = "CREDIT";

	callDepositeAPI(transactionObj);

}

async function callDepositeAPI(transactionObj) {
	const url = BASE_URL + '/deposite';

	const data = {
		method: 'POST',
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(transactionObj)
	};
	const rawResponse = await fetch(url, data);
	const message = await rawResponse.json();
if(message)
{
	alert("Successfully Deposited..!!!");
	const accountBal = localStorage.getItem("ACC_BAL");
    const Bal = Number(accountBal) + Number(transactionObj.amount);
    localStorage.setItem("ACC_BAL", Bal);
	window.location.href = UI_URL + '/depositeMoney.html';
	console.log(message);
	}
	else
	{
		alert("Deposite Failed..!!");
	}
}

//*****************************WITHDRAWN*******************************************

function withdraw() {

	const accountNum = document.getElementById('accNum').value;
	const amount = document.getElementById('amount').value;
	const source = document.getElementById('source').value;
	const remark = document.getElementById('remark').value;
	
	if(amount<0)
	{
		alert("Negative Balance Not Allowed!!!");
		return;
	}

	const transactionObj = {}
	transactionObj.accountNum = accountNum;
	transactionObj.amount = amount;
	transactionObj.source = source;
	transactionObj.remark = remark;
	transactionObj.type = "DEBIT";

	callWithdrawAPI(transactionObj);

}

async function callWithdrawAPI(transactionObj) {
	const url = BASE_URL + '/withdraw';

	const data = {
		method: 'POST',
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(transactionObj)
	};
	const rawResponse = await fetch(url, data);
	const message = await rawResponse.json();
if(message)
{
	alert("Successfully Withdrawn..!!!");
	const accountBal = localStorage.getItem("ACC_BAL");
    const Bal = Number(accountBal) - Number(transactionObj.amount);
    localStorage.setItem("ACC_BAL", Bal);
	window.location.href = UI_URL + '/withdrawMoney.html';
	console.log(message);
	}
	else
	{
		alert("Withdrawn failed..!!!\n \nKindly check your Balance!!!!");
		window.location.href = UI_URL + '/withdrawMoney.html';
	}
}
//*****************************TRANSACTIN STATEMENTS B/W DATES REFRESH*******************************************

window.onload = function() {
    var reloading = sessionStorage.getItem("reloading");
    if (reloading) {
        sessionStorage.removeItem("reloading");
      ganesh();
       
    }
}

function reloadG() {
    sessionStorage.setItem("reloading", "true");
    document.location.reload();
}
//*****************************TRANSACTIN STATEMENTS B/W DATES*******************************************

function ganesh()
{
const fromDate = document.getElementById('from').value;
const toDate = document.getElementById('to').value;
 const accNo = localStorage.getItem("ACC_NUM");

 const statementObj ={}
 statementObj.endDate = toDate;
 statementObj.startDate = fromDate;
 statementObj.accountNum=accNo;

 callStatementApi(statementObj);
 }
 
 async function callStatementApi(statementObj)
 {
 const url = BASE_URL + '/transaction';

	const data = {
		method: 'POST',
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(statementObj)
	};
	const rawResponse = await fetch(url, data);
	const allTransactions = await rawResponse.json();

	fillStatementTable(allTransactions)

	console.log(allTransactions);
}

//*****************************REFRESH***************************************
window.onload = function() {
    var reloading = sessionStorage.getItem("reload");
    if (reloading) {
        sessionStorage.removeItem("reload");
        
       fetchTransactionData();
       
    }
}

function reloadP() {
    sessionStorage.setItem("reload", "true");
    document.location.reload();
}
 

//*****************************ALL TRANSACTION STATEMENTS*******************************************

function fetchTransactionData() {

	const accountNum = localStorage.getItem("ACC_NUM");
	callTransactionDataAPI(accountNum);

}

async function callTransactionDataAPI(accountNum) {

	const url = BASE_URL + '/transaction/' + accountNum;

	const data = {
		method: 'GET',
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		}
	};
	const rawResponse = await fetch(url, data);
	const allTransactions = await rawResponse.json();

	 fillStatementTable(allTransactions);

	console.log(allTransactions);
}

function fillStatementTable(allTransactions) {

	const tbody = document.getElementById('statements');
	for (transaction of allTransactions) {


		let row = document.createElement('tr');

		let idCol = document.createElement('td');
		idCol.innerHTML = transaction.id;

		let accountNumCol = document.createElement('td');
		accountNumCol.innerHTML = transaction.accountNum;

		let amountCol = document.createElement('td');
		amountCol.innerHTML = transaction.amount;

		let typeCol = document.createElement('td');
		typeCol.innerHTML = transaction.type;

		let sourceCol = document.createElement('td');
		sourceCol.innerHTML = transaction.source;

		let dateCol = document.createElement('td');
		dateCol.innerHTML = transaction.date;

		let remarksCol = document.createElement('td');
		remarksCol.innerHTML = transaction.remark;

		row.append(idCol);
		row.append(accountNumCol);
		row.append(amountCol);
		row.append(typeCol);
		row.append(sourceCol);
		row.append(dateCol);
		row.append(remarksCol);

		tbody.append(row);
	}
}

//*****************************FUND TRANSFER*******************************************

function fundTransfer() {

	const payerAccNum = document.getElementById('payerAccNum').value;
	const payeeAccNum = document.getElementById('payeeAccNum').value;
	const amount = document.getElementById('amount').value;
	const source = document.getElementById('source').value;
	const remark = document.getElementById('remark').value;

    const accBal = localStorage.getItem("ACC_BAL");
   // const accNo = localStorage.getItem("ACC_NUM");
     if( payeeAccNum ==  payerAccNum)
{
	alert("OOPS.....!!!!\n Fund Not Transfered!!!!...\n Payer Account Number and  payee Account Number are Same....");
	return;
}
   
    if(Number(amount)>Number(accBal))
    {
    alert("Please Check your Balance");
    return;
    }
    if(amount<0)
	{
		alert("Negative Balance Not Allowed!!!");
		return;
	}
    
	const transactionCreditObj = {}
	transactionCreditObj.accountNum = payeeAccNum;
	transactionCreditObj.amount = amount;
	transactionCreditObj.source = source;
	transactionCreditObj.remark = remark;
	transactionCreditObj.type = "CREDIT";

	const transactionDebitObj = {}
	transactionDebitObj.accountNum = payerAccNum;
	transactionDebitObj.amount = amount;
	const accountBal = localStorage.getItem("ACC_BAL");
    const Bal = Number(accountBal) - Number(transactionDebitObj.amount);
    localStorage.setItem("ACC_BAL", Bal);
	transactionDebitObj.source = source;
	transactionDebitObj.remark = remark;
	transactionDebitObj.type = "DEBIT";
	
	const transactionArr = [];
	transactionArr.push(transactionDebitObj);
	transactionArr.push(transactionCreditObj);

	callFundTransferAPI({transactions: transactionArr});

}

async function callFundTransferAPI(transactionObj) {
	const url = BASE_URL + '/fundTransfers';

	const data = {
		method: 'POST',
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(transactionObj)
	};
	console.log(data);
	const rawResponse = await fetch(url, data);
	const message = await rawResponse.json();
   if(message)
{
	alert("Fund successfully Transfered");
	window.location.href = UI_URL + '/fundTransfer.html';
	console.log(message);
	}
	else
	{
		alert("Fund not Transfered");
	}
}

//*****************************PROFILE*******************************************

function fillProfilePage(){
	callProfileAPI();
}

async function callProfileAPI() {

	const accountNum = localStorage.getItem('ACC_NUM');

	const url = BASE_URL + '/profile/' + accountNum;

	const data = {
		method: 'GET',
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		}
	};

	const rawResponse = await fetch(url, data);
	const customer = await rawResponse.json();

	if (customer) {
		
		console.log(customer);

		document.getElementById('firstName').innerHTML = customer.firstName;
		document.getElementById('lastName').innerHTML = customer.lastName;
		document.getElementById('email').innerHTML = customer.email;
		document.getElementById('balance').innerHTML = customer.balance;
		document.getElementById('phone').innerHTML = customer.phone;
		document.getElementById('dob').innerHTML = customer.dob;
		document.getElementById('accountType').innerHTML = customer.accountType;

	} else {
		alert('Some error happens...');
	}


}