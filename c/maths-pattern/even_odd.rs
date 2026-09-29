fn is_even(n: i8) -> bool {
    if (n & 1) == 0 {
        return true;
    } else {
        return false;
    }
}

fn main() {
    let num: i8 = 98;
    println!("is even?: {}", is_even(num));
}
