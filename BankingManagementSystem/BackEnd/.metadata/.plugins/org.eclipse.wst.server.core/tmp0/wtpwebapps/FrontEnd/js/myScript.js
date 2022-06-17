// BackEnd URL
const BASE_URL = "http://localhost:9090/api";

// UI URL
const UI_URL = "http://localhost:8080/FrontEnd";


/************************** LOGIN ************************************* */
function doLogin() {

	const email = document.getElementById('email').value;
	const pass = document.getElementById('pass').value;

	//TODO : add validation for each field
	const loginObj = {};

	loginObj.email = email;
	loginObj.password = pass;

	checkLoginAPI(loginObj);

}
async function checkLoginAPI(loginObj) {
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
		
		localStorage.setItem("ACC_BAL", customer.balance);
		
		localStorage.setItem("ACC_NUM", customer.accountNo);
		window.location.href = UI_URL + '/dashBoard.html';
	}
	else { alert('Login failed'); }


	console.log(content);
}
/************************** CUstomer Registration************************************* */
function openAccount() {

	const firstName = document.getElementById('firstName').value;
	const lastName = document.getElementById('lastName').value;
	const email = document.getElementById('email').value;
	const pass = document.getElementById('pass').value;
	const phone = document.getElementById('phone').value;
	const dob = document.getElementById('dob').value;
	const accountType = document.getElementById('accountType').value;

	//TODO : add validation for each field

	const customerObj = {};
	customerObj.firstName = firstName;
	customerObj.lastName = lastName;
	customerObj.email = email;
	customerObj.phone = phone;
	customerObj.password = pass;
	customerObj.dob = dob;
	customerObj.accountType = accountType;

	addCustomerAPI(customerObj);

}
async function addCustomerAPI(customerObj) {
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

	if (customer) {
		alert('Registraion Successful');

		window.location.href = UI_URL + '/login.html';
	}
	else { alert('Login failed'); }

	console.log(customer);
}

/*****************************************************/

function fetchAccountNum() {
	const span = document.getElementById('accountNum');
	const accountNumber = localStorage.getItem("ACC_NUM");
	span.innerHTML = accountNumber;

}

/************************** Balance ************************************* */

function checkBalance(){
const accountBal = localStorage.getItem("ACC_BAL");
const button = document.getElementById('cb');

button.innerHTML = 'Balance : '+accountBal;
}




/************************** DEPOSITE MONEY************************************* */

function deposite() {

	const accountNum = document.getElementById('accNum').value;
	const amount = document.getElementById('amount').value;
	const source = document.getElementById('source').value;
	const remark = document.getElementById('remark').value;

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
	
	const accountBal = localStorage.getItem("ACC_BAL");
const Bal = Number(accountBal) + Number(transactionObj.amount);
localStorage.setItem("ACC_BAL", Bal);
	
	const message = await rawResponse.json();
    if(message)
    {
	alert("deposited successfully");
	window.location.href = UI_URL + '/dashBoard.html';
	
	
	console.log(message);
	}
	else
	{
	alert("failed to deposit");
	}
}

/************************** WithDraw MONEY************************************* */

function withdraw() {

	const accountNum = document.getElementById('accNum').value;
	const amount = document.getElementById('amount').value;
	const source = document.getElementById('source').value;
	const remark = document.getElementById('remark').value;

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
	
	const accountBal = localStorage.getItem("ACC_BAL");
	const Bal = Number(accountBal) - Number(transactionObj.amount);
	localStorage.setItem("ACC_BAL", Bal);
	
	const message = await rawResponse.json();
	if(message)
	{
	alert("withdrawn succesfully");
	
	window.location.href = UI_URL + '/dashBoard.html';
	console.log(message);
	}
	else
	{
	alert("failed");
	}
}


/************************** SHOW STATEMENTs************************************* */

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

	fillStatementTable(allTransactions)

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

/************************** FUND TRANSFER************************************* */
function fundTransfer() {

	const payerAccNum = document.getElementById('payerAccNum').value;
	const payeeAccNum = document.getElementById('payeeAccNum').value;
	const amount = document.getElementById('amount').value;
	const source = document.getElementById('source').value;
	const remark = document.getElementById('remark').value;


	const transactionCreditObj = {}
	transactionCreditObj.accountNum = payeeAccNum;
	transactionCreditObj.amount = amount;
	transactionCreditObj.source = source;
	transactionCreditObj.remark = remark;
	transactionCreditObj.type = "CREDIT";

	const transactionDebitObj = {}
	transactionDebitObj.accountNum = payerAccNum;
	transactionDebitObj.amount = amount;
	transactionDebitObj.source = source;
	transactionDebitObj.remark = remark;
	transactionDebitObj.type = "DEBIT";
	
	const accountBal = localStorage.getItem("ACC_BAL");
	const Bal = Number(accountBal) - Number(transactionDebitObj.amount);
	localStorage.setItem("ACC_BAL", Bal);
	

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
	alert("funds transferred successfully");
	window.location.href = UI_URL + '/dashBoard.html';
	console.log(message);
	}
	else
	{
	alert("failed to transfer");
	}
}