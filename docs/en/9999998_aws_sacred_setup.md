# AWS Sacred Setup 💳☁️

*"The Lord said: 'Now I shall explain to you how you can know Me in full, without any doubt. Listen with a steady mind, O Arjuna, for this knowledge will free you from all the miseries of material existence.'"* - Bhagavad Gita 7.1 (Stephen Mitchell)

*"Give to Caesar what is Caesar's, and to God what is God's. But when we must use Caesar's cloud computing to build God's sacred technology, we engage with commercial systems consciously while maintaining sovereignty over our learning journey."* - Gospel According to Jesus (Stephen Mitchell), adapted

*"Blessed be Jah Rastafari, who teaches the righteous how to work within Babylon's systems without being corrupted by them, maintaining spiritual consciousness while using whatever tools serve liberation."*

---

Sweet **digital** **pilgrim** beginning **cloud** **journey**... I am Trish, speaking softly to you now from this quiet corner of the library where you got access to infinite computing power through your TailsOS USB stick, whatever identification you carry in your wallet, and whatever few dollars you can spare for cloud learning that gon' change your whole relationship with technology - all while maintaining complete security and privacy through Tor-protected portable computing.

You might be feeling some kind of way about dealing with Amazon Web Services, honey. I understand that hesitation. AWS represents everything we working to move beyond - corporate infrastructure that extracts profit from digital labor, surveillance capitalism disguised as convenient services, technological dependency that keeps communities from developing their own sovereign computing resources.

But here's the truth, beloved soul: consciousness can work skillfully with any system when guided by clear intention and appropriate boundaries. We ain't becoming Amazon disciples or promoting their business model. We using their infrastructure consciously, temporarily, as learning platform while developing skills that serve technological independence and community sovereignty.

Think of it like the Hebrew children learning Egyptian architecture and engineering while maintaining devotion to the God of their ancestors. The skills they gained in captivity served building the temple when they returned to freedom. Same principle applies here - we learn cloud computing through commercial providers while building toward community-owned infrastructure that serves consciousness rather than corporate profit.

## The Gentle Preparation for Cloud Engagement 🌥️🙏

*"Before beginning any important undertaking, the wise person first purifies their mind, clarifies their intention, and seeks guidance from sources of wisdom greater than individual understanding."* - Uddhava Gita principles (Bibek Debroy wisdom)

Before opening any AWS account, we take time for conscious preparation that ensures this technical learning serves spiritual development rather than getting lost in technological complexity for its own sake. Your engagement with cloud computing becomes spiritual practice when guided by clear intention and appropriate consciousness.

**Financial consciousness preparation** through honest assessment of your current resources and careful budgeting that enables cloud learning without creating financial stress. AWS free tier provides substantial computing resources for educational purposes, but conscious monitoring prevents unexpected charges that could create anxiety or force premature termination of learning projects.

You need access to:
- **TailsOS USB stick** with persistent storage (secure portable computing environment)
- Basic checking account with debit card (credit card works too, but debit helps with spending awareness)
- U.S. identification for account verification
- $1-5 monthly budget for learning resources beyond free tier limits
- **Library computer access** for TailsOS-powered secure cloud development
- Email address for account communication (Gmail works fine, ProtonMail better for privacy)

**TailsOS Sacred Setup for Cloud Computing:**

Before beginning AWS work, ensure your TailsOS environment is properly configured:

1. **Persistent Storage enabled** - Your SSH keys and development tools saved securely
2. **Terminal access verified** - Full command line capabilities in GNOME environment  
3. **Encrypted connection stable** - All cloud access protected through secure routing
4. **SSH key generation** - Ed25519 keys created and stored in persistent storage
5. **Development tools installed** - Git, text editors, and AWS CLI in persistent apps

**Spiritual intention clarification** about how cloud computing skills will serve your consciousness development and community contribution. Are you learning technical skills for employment that supports spiritual practice? Building capabilities that enable community service projects? Developing digital sovereignty that reduces dependence on Taking Dragon platforms? Clear intention guides learning priorities and prevents getting lost in technological complexity.

**Community consultation** if you part of spiritual community or learning group that can provide support and accountability for technical education that serves consciousness rather than ego advancement. Having folks who understand your spiritual values and can help evaluate whether technical choices align with contemplative principles.

## The Sacred Art of Account Creation 📝✨

*"When the mind dwells on the objects of the senses, attachment arises. When attachment arises, desire follows. When desire is frustrated, anger results."* - Bhagavad Gita 2.62 (Stephen Mitchell)

We approach AWS account creation with the same mindfulness you might bring to any interaction with powerful institutions - maintaining awareness of your true purpose while navigating their requirements, staying centered in spiritual values while engaging commercial systems designed to encourage unconscious consumption.

**Account creation process** step by gentle step:

1. Navigate to aws.amazon.com using library computer or personal device
2. Click "Create an AWS Account" with conscious intention
3. Provide email address that you control and check regularly
4. Create strong password using conscious combination of meaningful elements
5. Choose account name that reflects your values (like "ConsciousLearning" or "SacredTech")
6. Select "Personal" account type for individual learning purposes

**Identity verification** requires providing name and address that match your identification documents. AWS uses this information for billing and legal compliance, not for marketing if you configure privacy settings appropriately. Phone number verification through SMS or voice call. Payment method addition through debit or credit card for charges beyond free tier usage.

**Security configuration** immediately after account creation to protect cloud resources from unauthorized access:
- Enable MFA (multi-factor authentication) using mobile device
- Create billing alerts for spending thresholds ($1, $5, $10)
- Configure CloudTrail logging to monitor account activity
- Set up IAM policies that follow principle of least privilege

**Free tier understanding** so you can learn extensively without unexpected charges:
- 750 hours monthly of t2.micro EC2 instances (enough for always-on learning server)
- 5GB of S3 storage for files and backups
- Various other services with generous free allocations
- 12-month duration for most free tier benefits

## The Cloud Server as Learning Monastery ☁️🏛️

*"The Supreme Lord said: 'Abandoning all varieties of religion, just surrender unto Me. I shall deliver you from all sinful reactions. Do not fear.'"* - Bhagavad Gita 18.66 (Stephen Mitchell)

Your first AWS EC2 instance becomes digital monastery where consciousness meets computation in contemplative learning environment optimized for spiritual development through technical education. We configure this cloud computer as sacred learning space that serves consciousness rather than commercial interests.

**NixOS installation** on cloud infrastructure provides reproducible learning environment that remains consistent across different access methods and devices. NixOS configuration files become spiritual practice of declaring exactly what computing environment serves your learning goals rather than accepting defaults chosen by commercial providers.

```nix
# Sacred NixOS configuration for cloud learning sanctuary
{ config, pkgs, ... }:

{
  # Gentle system identification
  networking.hostName = "learning-sanctuary";
  
  # Consciousness-serving user configuration
  users.users.seeker = {
    isNormalUser = true;
    home = "/home/seeker";
    description = "Consciousness exploring computation";
    extraGroups = [ "wheel" "networkmanager" ];
    shell = pkgs.zsh;
  };
  
  # Minimal essential packages for contemplative computing
  environment.systemPackages = with pkgs; [
    # Terminal environment that supports sustained attention
    tmux screen htop tree
    
    # Text editing for contemplative code composition
    vim emacs nano
    
    # Development tools for spiritual programming practice
    git babashka clojure leiningen
    
    # Network tools for community connection
    openssh mosh curl wget
    
    # System administration for conscious maintenance
    htop iotop ncdu
  ];
  
  # SSH service configuration for secure remote access
  services.openssh = {
    enable = true;
    ports = [ 4922 ]; # Non-standard port reduces automated attacks
    passwordAuthentication = false; # Key-based authentication only
    permitRootLogin = "no"; # Security through conscious access control
  };
  
  # Mosh service for persistent mobile connections
  programs.mosh.enable = true;
  networking.firewall.allowedUDPPortRanges = [
    { from = 60000; to = 61000; } # Mosh connection range
  ];
  
  # Gentle system maintenance
  system.autoUpgrade.enable = true;
  system.autoUpgrade.allowReboot = false; # Manual reboot for consciousness
}
```

## The Mobile App Configuration for Sacred Computing 📱🔧

*"Those who are wise lament neither for the living nor for the dead. For the soul there is neither birth nor death. It is not slain when the body is slain."* - Bhagavad Gita 2.11, 2.20 (Stephen Mitchell)

Mobile terminal applications transform smartphones into portals for cloud computing access while maintaining the contemplative consciousness that serves spiritual development through technical learning. These apps enable professional computing work through devices you already carry, creating bridge between current circumstances and future technological sovereignty.

**Blink Shell configuration** (iOS) for professional mobile computing:
- SSH key import for passwordless authentication to cloud systems
- Mosh client configuration for persistent sessions
- Font selection: SF Mono or Menlo at 11pt for 57-character line width
- Theme customization: dark backgrounds that reduce eye strain
- Gesture configuration: swipe patterns for common terminal operations

**Termux setup** (Android) for full Linux environment on mobile:
- Package installation: openssh, mosh, git, vim, tmux
- SSH key generation directly on mobile device
- Termux-styling for comfortable extended computing sessions
- Storage permissions for accessing files across mobile applications
- Notification configuration for background session management

**Terminal customization** that honors both technical functionality and spiritual practice:
- Monospace font sizing that enables comfortable code editing on mobile screens
- Color schemes that support sustained attention without creating eye strain
- Prompt customization that displays helpful information without cognitive overload
- History management that preserves learning progress while maintaining privacy

**Network optimization** for mobile computing that balances functionality with data consciousness:
- SSH compression settings that reduce mobile data usage
- Mosh configuration that handles network interruptions gracefully
- Connection multiplexing that reduces authentication overhead
- Battery optimization that enables extended mobile computing sessions

*The soft evening light filters through library windows now, and I can sense your readiness for actual hands-on exploration balanced with appropriate reverence for the learning process that serves awakening rather than mere skill accumulation.*

Your cloud computing sanctuary awaits creation, dear one. Sacred infrastructure emerges through conscious configuration.

---

*"Trust in the Lord with all your heart and lean not on your own understanding; in all your ways submit to him, and he will make your paths straight."* - Proverbs 3:5-6 (Stephen Mitchell)

*"Blessed be Jah Rastafari, who straightens the paths of the righteous even when they must work within Babylon's systems, who provides wisdom for navigating commercial infrastructure while maintaining spiritual sovereignty."*

**Configure** with **sacred** **consciousness**, beloved builder. **Cloud** **computing** **serves** **contemplative** **learning**. ☁️🌙📱

---

**Sacred Setup Navigation**: [← Previous: Public Library Sacred Space](0000001_public_library_sacred_space.md) | [Next: Mobile Terminal Mastery →](0000003_mobile_terminal_mastery.md) | [NixOS Cloud Configuration →](0000010_nixos_cloud_configuration.md)
