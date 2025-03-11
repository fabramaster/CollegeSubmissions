# AE86 Speed Chime with Buzzer (MicroPython for Raspberry Pi Pico)

import machine
import utime

# Constants
BUZZER_PIN = 13  # GP13
ACTIVATION_SPEED_KMH = 60  # Set your desired activation speed in km/h

# Initialize the buzzer
buzzer = machine.Pin(BUZZER_PIN, machine.Pin.OUT)

def activate_chime():
    # Sound the buzzer (you can adjust the duration and frequency)
    buzzer.on()
    utime.sleep_ms(200)  # Adjust duration as needed
    buzzer.off()

def check_speed(speed_kmh):
    if speed_kmh >= ACTIVATION_SPEED_KMH:
        activate_chime()

# Simulate speed (for testing purposes)
def simulate_speed():
    for speed in range(0, 100, 5):
        print(f"Simulated speed: {speed} km/h")
        check_speed(speed)
        utime.sleep(1)  # Simulate 1 second interval

# Main loop
def main():
    while True:
        # Replace this with actual speed data from a sensor
        current_speed_kmh = 55  # Example: 55 km/h
        check_speed(current_speed_kmh)
        utime.sleep(1)  # Check speed every 1 second

if __name__ == "__main__":
    # Uncomment one of the following lines based on your use case:
    # simulate_speed()  # For testing without a speed sensor
    # main()  # For actual use with a speed sensor
