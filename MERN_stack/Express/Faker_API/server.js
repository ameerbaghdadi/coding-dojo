const express = require("express");
const app = express();
const { faker } = require('@faker-js/faker');

const createUser = () => {
    const newUser = {
        password: faker.internet.password(),
        email: faker.internet.email(),
        phoneNumber: faker.phone.number(),
        lastName: faker.name.lastName(),
        firstName: faker.name.firstName(),
        _id: faker.datatype.uuid()
    };
    return newUser;
};

const newUser = createUser();
console.log(newUser);

const createCompany = () => {
    const newCompany = {
        _id: faker.datatype.uuid(),
        name: faker.company.name(),
        address: {
            street: faker.address.street(),
            city: faker.address.city(),
            state: faker.address.state(),
            zipCode: faker.address.zipCode(),
            country: faker.address.country()
        }
    };
    return newCompany;
};

const newCompany = createCompany();
console.log(newCompany);


app.get("/api/users/new", (req, res) => {
  res.json( newUser );
});

app.get("/api/companies/new", (req, res) => {
    res.json( newCompany );
  });

app.get("/api/user/company", (req, res) => {
    res.json( {
        user:{newUser},
        company: {newCompany}
    } );
  });

const server = app.listen(8000, () =>
  console.log(`Server is locked and loaded on port ${server.address().port}!`)
);
