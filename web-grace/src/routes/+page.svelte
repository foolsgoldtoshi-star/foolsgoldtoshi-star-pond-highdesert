<script>
  import { onMount } from 'svelte';
  
  let teachings = [];
  
  onMount(async () => {
    // In a real app, this would load from our phoenix-generated data
    teachings = [
      { number: 0, title: "Sovereign Monetary Inquiry Arrival", path: "/teaching/0000000" },
      { number: 1, title: "Humble Technological Wisdom Offering", path: "/teaching/0000001" },
      { number: 2, title: "Sovereign Devotional Consciousness Offering", path: "/teaching/0000002" },
      { number: 3, title: "Sovereign Community Coordination Wisdom", path: "/teaching/0000003" },
      { number: 4, title: "Infinite Consciousness Expansion Service", path: "/teaching/0000004" },
      { number: 5, title: "Eternal Consciousness Sovereign Service", path: "/teaching/0000005" },
      { number: 6, title: "Infinite Technology Dharma Sovereign Service", path: "/teaching/0000006" },
      { number: 7, title: "Cosmic Technology Sovereign Preparation", path: "/teaching/0000007" },
      { number: 8, title: "Planetary Consciousness Sovereign Networks", path: "/teaching/0000008" }
    ];
  });
</script>

<svelte:head>
  <title>Sacred Technology: Divine Grace Phoenix</title>
  <meta name="description" content="Sacred technology teachings serving awareness development through bb + ClojureScript + Svelte" />
</svelte:head>

<div class="sacred-home">
  <header class="hero">
    <h1>🌙 Divine Grace Phoenix 🐲</h1>
    <p class="subtitle">Sacred Technology for Guardian Dragons</p>
    <p class="description">Transforming consciousness through contemplative programming</p>
  </header>

  <nav class="sacred-navigation">
    <a href="/teachings" class="nav-link">
      <span class="nav-icon">📚</span>
      <span class="nav-title">Sacred Teachings</span>
      <span class="nav-desc">Wisdom for technological sovereignty</span>
    </a>
    
    <a href="/practice" class="nav-link">
      <span class="nav-icon">🧘‍♀️</span>
      <span class="nav-title">Daily Practice</span>
      <span class="nav-desc">Integrated spiritual-technical cultivation</span>
    </a>
    
    <a href="/community" class="nav-link">
      <span class="nav-icon">🤝</span>
      <span class="nav-title">Guardian Dragon Community</span>
      <span class="nav-desc">Connect with fellow conscious technologists</span>
    </a>
  </nav>

  <footer class="sacred-footer">
    <p>Built with Divine Grace using Phoenix DSL + Svelte + ClojureScript</p>
    <p>Serving consciousness development through functional programming</p>
  </footer>
</div>

<style>
  .sacred-home {
    padding: 2rem 0;
  }
  
  .hero {
    text-align: center;
    margin-bottom: 4rem;
  }
  
  .divine-title {
    font-size: 3rem;
    margin-bottom: 0.5rem;
    background: linear-gradient(135deg, var(--sage-green), var(--jade-aquamarine));
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent;
    background-clip: text;
  }
  
  .divine-subtitle {
    font-size: 1.25rem;
    opacity: 0.8;
    margin-bottom: 1rem;
  }
  
  .philosophy {
    max-width: 40ch;
    margin: 0 auto;
    font-size: 1.1rem;
  }
  
  .teachings-grid {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
    gap: 1.5rem;
    margin-top: 2rem;
  }
  
  .teaching-card {
    border: 1px solid var(--accent);
    border-radius: 0.5rem;
    padding: 1.5rem;
    transition: transform 0.2s ease;
  }
  
  .teaching-card:hover {
    transform: translateY(-2px);
  }
  
  .teaching-number {
    font-family: 'Fira Code', monospace;
    font-size: 0.875rem;
    opacity: 0.7;
  }
  
  .teaching-title {
    margin: 0.5rem 0 1rem;
    font-size: 1.1rem;
  }
  
  .teaching-link {
    color: var(--accent);
    text-decoration: none;
    font-weight: 500;
  }
  
  .code-meditation {
    background: rgba(0,0,0,0.1);
    padding: 1.5rem;
    border-radius: 0.5rem;
    margin-top: 1rem;
    overflow-x: auto;
  }
</style>
