
## Unbounded vs. Bounded Comparison
| Wildcard | Meaning | Example |
|----------|---------|---------|
| `<?>` | Any type | `List<?> list = new ArrayList<String>();` |
| `? extends T` | T or subclass of T | `List<? extends Number>` (Integer, Double, etc.) |
| `? super T` | T or superclass of T | `List<? super Integer>` (Number, Object, etc.) |

**Wildcard provides flexibility** without losing type safety.