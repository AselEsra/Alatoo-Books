package com.com19alatoo.webpage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

    @Controller
    @RequestMapping("/books")
    public class BooksControler {
        @Autowired
        private BooksRepository booksRepository;

        @PostMapping("/add")
        public @ResponseBody String addNewBook(@RequestBody Books book) {
            booksRepository.save(book);
            return "OK";
        }

        @GetMapping("/all")
        public @ResponseBody Iterable<Books> getAllBooks() {
            return booksRepository.findAll();
        }

        @GetMapping("/{id}")
        public @ResponseBody Books one(@PathVariable Integer id) {
            return booksRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
        }

        @PutMapping("/{id}")
        public @ResponseBody Books put(@RequestBody Books replaceBooks, @PathVariable Integer id) {
            return booksRepository.findById(id).map(books -> {
                books = replaceBooks;
                books.setId(id);
                return booksRepository.save(books);
            }).orElseThrow(() -> new BookNotFoundException(id));
        }

        @DeleteMapping("/{id}")
        void del(@PathVariable Integer id) {
            booksRepository.deleteById(id);
        }
    }

