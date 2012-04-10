describe("The Book", function() {
    it("author must be 'none' when new Book", function() {
        var book = new Book();
        expect(book.getAuthor()).toBe("none");
    });
});
