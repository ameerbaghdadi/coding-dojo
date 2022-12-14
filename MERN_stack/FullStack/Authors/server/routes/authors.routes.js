const AuthorController = require('../controllers/authors.controller');
module.exports = function(app){
    app.post('/api/authors/new', AuthorController.createAuthor);
    app.get('/api/authors', AuthorController.findAllAuthors);
    app.get('/api/authors/:id', AuthorController.findOneAuthor);
    app.put('/api/authors/update/:id', AuthorController.updateExistingAuthor);
    app.delete('/api/authors/delete/:id', AuthorController.deleteAnExistingAuthor);
}