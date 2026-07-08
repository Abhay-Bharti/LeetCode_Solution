func sumAndMultiply(n int) int64 {
	if n == 0 {
		return 0
	}

	count := int(math.Log10(math.Abs(float64(n)))) + 1
	pow := int(math.Pow(10, float64(count-1)))

	var x int64 = 0
	var sum int64 = 0

	for pow > 0 {
		a := int64(n / pow)

		n %= pow
		pow /= 10

        if a == 0 {
            continue
        }

		x = a + x*10
		sum += a
	}

	return sum * x
}
