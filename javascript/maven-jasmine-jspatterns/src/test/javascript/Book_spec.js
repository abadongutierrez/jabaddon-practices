describe("The Book", function() {
    it("getAuthor is a function", function() {
        var book = new Book();
        expect(book.getAuthor instanceof Function).toBe(true);
    });
    
    it("author must be 'none' when new Book", function() {
        var book = new Book();
        expect(book.getAuthor()).toBe("none");
    });
    
    it("author property is accesible", function() {
        var book = new Book();
        expect(book.author).toBe("none");
    });
});
