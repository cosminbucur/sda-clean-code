```
double disabilityAmount() {
  if (seniority < 2) {
    return 0;
  }
  if (monthsDisabled > 12) {
    return 0;
  }
  if (isPartTime) {
    return 0;
  }
}
```

```
double disabilityAmount() {
  if (isNotEligibleForDisability()) {
    return 0;
  }
}
```