
## 🔥 Coupling Comparison

### ❌ Tight Coupling
- Service Class = Object Creation + Business Logic
- Example:
  OrderService creates its own dependencies using `new`

👉 Problems:
- Hard to change implementation
- Not flexible
- Difficult to test

---

### ✅ Loose Coupling (Manual Dependency Injection)
- Main Class = Object Creation
- Service Class = Uses dependencies (business logic only)

👉 Benefits:
- Easy to change implementation
- Better flexibility
- Cleaner design
- Follows SOLID principles
