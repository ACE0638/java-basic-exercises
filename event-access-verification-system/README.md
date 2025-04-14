# Event Access Verification System 🔐

A Java console application that verifies if a user can access an event based on age, ticket type, and parental consent (for minors). Perfect for practicing conditional logic and user input handling in Java.

---

## Features

- **Ticket Validation**:
  - **VIP Tickets**: Only allowed for users aged **18+**.
  - **Regular Tickets**: 
    - Allowed for users aged **18+**.
    - Users aged **16-17** require parental consent.
    - Users under **16** are denied access.
- **Input Handling**: Robust input collection with `Scanner`.
- **Clear Feedback**: User-friendly messages for allowed/denied access.
