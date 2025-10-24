import qrcode
from PIL import Image

def generate_qr_code(data, filename="qrcode.png", box_size=10, border=4):
    """
    Generate a QR code from the provided data.
    
    Args:
        data (str): The data to encode in the QR code
        filename (str): Output filename for the QR code image
        box_size (int): Size of each box in pixels
        border (int): Border size in boxes
    """
    # Create QR code instance
    qr = qrcode.QRCode(
        version=1,  # Controls the size of the QR code
        error_correction=qrcode.constants.ERROR_CORRECT_L,
        box_size=box_size,
        border=border,
    )
    
    # Add data to the QR code
    qr.add_data(data)
    qr.make(fit=True)
    
    # Create an image from the QR code
    img = qr.make_image(fill_color="black", back_color="white")
    
    # Save the image
    img.save(filename)
    print(f"QR code saved as {filename}")
    
    return img


def generate_colored_qr_code(data, filename="qrcode_colored.png", 
                             fill_color="blue", back_color="yellow"):
    """
    Generate a colored QR code.
    
    Args:
        data (str): The data to encode in the QR code
        filename (str): Output filename for the QR code image
        fill_color (str): Color for the QR code pattern
        back_color (str): Background color
    """
    qr = qrcode.QRCode(
        version=1,
        error_correction=qrcode.constants.ERROR_CORRECT_H,
        box_size=10,
        border=4,
    )
    
    qr.add_data(data)
    qr.make(fit=True)
    
    img = qr.make_image(fill_color=fill_color, back_color=back_color)
    img.save(filename)
    print(f"Colored QR code saved as {filename}")
    
    return img


# Example usage
if __name__ == "__main__":
    print("=== QR Code Generator ===")
    print("\nOptions:")
    print("1. Basic QR Code (Black & White)")
    print("2. Colored QR Code")
    
    choice = input("\nEnter your choice (1 or 2): ").strip()
    
    # Get link/data from user
    data = input("Enter the URL or text to encode: ").strip()
    
    if not data:
        print("Error: No data provided!")
        exit()
    
    # Get filename
    filename = input("Enter output filename (press Enter for 'qrcode.png'): ").strip()
    if not filename:
        filename = "qrcode.png"
    elif not filename.endswith('.png'):
        filename += '.png'
    
    if choice == "2":
        # Colored QR code
        fill = input("Enter fill color (press Enter for 'black'): ").strip() or "black"
        back = input("Enter background color (press Enter for 'white'): ").strip() or "white"
        generate_colored_qr_code(data, filename, fill, back)
    else:
        # Basic QR code
        generate_qr_code(data, filename)
    
    print(f"\n✓ QR code successfully created!")
    print(f"✓ Saved as: {filename}")