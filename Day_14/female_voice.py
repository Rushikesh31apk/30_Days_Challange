import pyttsx3

def setup_female_voice():
    # Initialize the text-to-speech engine
    engine = pyttsx3.init()
    
    # Get all available voices
    voices = engine.getProperty('voices')
    
    # Set female voice
    # voices[1] is typically the female voice in most systems
    # If it doesn't work, try iterating through available voices
    engine.setProperty('voice', voices[1].id)
    
    # Optional: Adjust properties for better female voice clarity
    engine.setProperty('rate', 150)    # Speed of speech
    engine.setProperty('volume', 0.9)  # Volume level
    
    return engine

def speak_text(text):
    engine = setup_female_voice()
    engine.say(text)
    engine.runAndWait()

# Example usage
text = """Your Kotlin interview questions content here..."""

# Test if voice is female
engine = setup_female_voice()
engine.say("Hello, I am your female voice assistant for Kotlin interview preparation.")
engine.runAndWait()

# Speak the main content
speak_text(text)

# To list all available voices and find the best female voice
def list_available_voices():
    engine = pyttsx3.init()
    voices = engine.getProperty('voices')
    
    print("Available voices:")
    for idx, voice in enumerate(voices):
        print(f"Voice {idx}:")
        print(f" - ID: {voice.id}")
        print(f" - Name: {voice.name}")
        print(f" - Languages: {voice.languages}")
        print(f" - Gender: {voice.gender}")
        print("------------------------")
list_available_voices()

# Uncomment to see all available voices
# list_available_voices()