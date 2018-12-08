var createPersonTable = function () {
    var request = new XMLHttpRequest();
    request.onreadystatechange = function () {
        if(request.readyState == 4 && request.status == 200) {
            var personList = JSON.parse(this.responseText)

            //to identify the no. of column and the header
            var col = [];
            for (var index = 0; index < personList.length; index++) {
                for (var key in personList[index]) {
                    if (col.indexOf(key) === -1) {
                        col.push(key);
                    }
                }
            }

            // to create the table with header
            var table = document.createElement("table");
            var tr = table.insertRow(-1);
            for(var index = 0; index < col.length; index++) {
                var th = document.createElement("th");
                th.innerHTML = col[index];
                tr.appendChild(th);
            }

            //to insert the value into the table
            for(var index = 0; index < personList.length; index++) {
                tr = table.insertRow(-1);
                for(var tableCell = 0; tableCell < col.length; tableCell++) {
                    var tableCellElement = tr.insertCell(-1);
                    tableCellElement.innerHTML = personList[index][col[tableCell]];
                }
            }

            // creating an add button to add the person
            var addButton = document.createElement("button");
            // addButton.type = "button";
            addButton.id = "addButton";
            var addPerson = document.getElementById("addPerson");
            addButton.innerHTML = "add";
            addPerson.appendChild(addButton);

            // to create the label with input box
            var personContainer = document.getElementById("details");
            personContainer.innerHTML = "";
            personContainer.appendChild(table);
            var personLabel = document.getElementById("personLabel");
            personLabel.innerHTML = "";
            for (var index = 0; index < col.length; index++) {
                var label = document.createElement("label");
                // label.setAttribute("for",col[index]);
                label.innerHTML = col[index];
                personLabel.appendChild(label);
                var input = document.createElement("input");
                input.id = col[index];
                input.type = "text";
                // input.setAttribute = col[1].personList[0];
                // input.value = personList[index][col[tableCell]];
                input.value = personList[0][col[index]];
                personLabel.appendChild(input);
            }

            // displaying the element in the table
            for(var i = 1; i < table.rows.length; i++) {
                table.rows[i].onclick = function() {
                     //rIndex = this.rowIndex;
                     // for (j = 0; j < col.length; j++) {
                     document.getElementById("id").value = this.cells[0].innerHTML;
                     document.getElementById("firstName").value = this.cells[1].innerHTML;
                     document.getElementById("lastName").value = this.cells[2].innerHTML;
                     document.getElementById("email").value = this.cells[3].innerHTML;
                     document.getElementById("birthDate").value = this.cells[4].innerHTML;
                     // }
                };
            }

            // displaying the submit button
            var submitButton = document.createElement("button");
            var updatePerson = document.getElementById("updatePerson");
            submitButton.innerHTML = "submit";
            updatePerson.appendChild(submitButton);

            addButton.onclick = function () {
                document.getElementById("id").value = "";
                document.getElementById("firstName").value = "";
                document.getElementById("lastName").value = "";
                document.getElementById("email").value = "";
                document.getElementById("birthDate").value = "";
            }

            submitButton.onclick = function() {
                var id = document.getElementById("id").value;
                var firstName = document.getElementById("firstName").value;
                var secondName = document.getElementById("lastName").value;
                var email = document.getElementById("email").value;
                var birthDate = document.getElementById("birthDate").value;
                // table.innerHTML += id + firstName + secondName + email + birthDate;
                var obj = { table:[] };
                obj.table.push({id});
                obj.table.push({firstName});
                obj.table.push({secondName});
                obj.table.push({email});
                obj.table.push({birthDate});
                var json = JSON.stringify(obj);
                var fs = require("fs");
                fs.writeFile('assets/person.json', json);
            }
        }
    };

    request.open("GET", "assets/person.json", true);
    request.send();
}