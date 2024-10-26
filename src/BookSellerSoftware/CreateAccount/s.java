package BookSellerSoftware.CreateAccount;

@RestController
@RequestMapping("/api/bookbrokers")
public class BookBrokerController {

    @Autowired
    private BookBrokerService bookBrokerService;

    @PostMapping("/register")
    public ResponseEntity<String> registerBookBroker(@RequestBody BookBroker bookBroker) {
        bookBrokerService.register(bookBroker);
        return ResponseEntity.ok("BookBroker registered successfully.");
    }
}
